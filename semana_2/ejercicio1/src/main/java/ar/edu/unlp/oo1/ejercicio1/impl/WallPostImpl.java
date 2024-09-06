package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	private String text = "Undefined post";
	private int likes = 0;
	private boolean featured = false;

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		this.likes++;
	}

	@Override
	public void dislike() {
		if (this.likes > 0){
			this.likes--;
		}
	}

	@Override
	public boolean isFeatured() {
		return this.featured;
	}

	@Override
	public void toggleFeatured() {
		this.featured = !this.featured;
	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
