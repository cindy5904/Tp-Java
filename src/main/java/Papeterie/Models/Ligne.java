package Papeterie.Models;

public class Ligne  {
    private Article article;

    private ArticleUnitaire articleUnitaire;
    private int quantite;

    public Ligne(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;

    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public ArticleUnitaire getArticleUnitaire() {
        return articleUnitaire;
    }

    public void setArticleUnitaire(ArticleUnitaire articleUnitaire) {
        this.articleUnitaire = articleUnitaire;
    }
}
