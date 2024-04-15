package org.example.Citerne;

public class Citernes {
   private float poidsAvide;
   private float capaciteTotal;
   private float niveauRemplissage;
   private float capaciteMaximale;
   private  static float totaliteCiternes = 0;

    public Citernes (float capaciteTotal, float niveauRemplissage, float poidsAvide) {
        this.capaciteTotal = capaciteTotal;
        this.niveauRemplissage = niveauRemplissage;
        this.poidsAvide = poidsAvide;
        totaliteCiternes += niveauRemplissage;
        capaciteMaximale += capaciteTotal;

    }

    public float getPoidsAvide() {
        return poidsAvide;
    }

    public void setPoidsAvide(float poidsAvide) {
        this.poidsAvide = poidsAvide;
    }

    public float getCapaciteTotal() {
        return capaciteTotal;
    }

    public void setCapaciteTotal(float capaciteTotal) {
        this.capaciteTotal = capaciteTotal;
    }
    public float getNiveauRemplissage() {
        return niveauRemplissage;
    }

    public void setNiveauRemplissage(float niveauRemplissage) {
        this.niveauRemplissage = niveauRemplissage;
    }

    public float poidsTotal() {
        return poidsAvide + niveauRemplissage;
    }

    public static float getTotaliteCiternes() {
        return totaliteCiternes;
    }

    public float getCapaciteMaximale() {
        return capaciteMaximale;
    }

    public float remplir(float quantiteAjouter) {
        float quantiteRestante = capaciteTotal - niveauRemplissage;
        if (quantiteAjouter > quantiteRestante) {
            float excessWater = quantiteAjouter - quantiteRestante;
            niveauRemplissage = capaciteTotal;
            totaliteCiternes += quantiteRestante;
            return excessWater;
        } else {
            niveauRemplissage += quantiteAjouter;
            totaliteCiternes += quantiteAjouter;
            return 0;
        }
    }
    public float vider(float quantiteAretirer) {
        if (quantiteAretirer <= niveauRemplissage) {
            niveauRemplissage -= quantiteAretirer;
            totaliteCiternes -= quantiteAretirer;
            return quantiteAretirer;
        } else {
            float quantiteRetiree = niveauRemplissage;
            niveauRemplissage = 0;
            totaliteCiternes -= quantiteRetiree;
            return quantiteRetiree;
        }
    }
}


