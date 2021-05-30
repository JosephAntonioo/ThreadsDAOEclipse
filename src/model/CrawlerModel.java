package model;

public class CrawlerModel {
    private Long id;

    private String data;

    private String cidade;

    private String confirmado;

    private String confirmado100k;

    private String obito;

    private String letalitade;

    private String obito100k;

    private String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getConfirmado() {
		return confirmado;
	}

	public void setConfirmado(String confirmado) {
		this.confirmado = confirmado;
	}

	public String getConfirmado100k() {
		return confirmado100k;
	}

	public void setConfirmado100k(String confirmado100k) {
		this.confirmado100k = confirmado100k;
	}

	public String getObito() {
		return obito;
	}

	public void setObito(String obito) {
		this.obito = obito;
	}

	public String getLetalitade() {
		return letalitade;
	}

	public void setLetalitade(String letalitade) {
		this.letalitade = letalitade;
	}

	public String getObito100k() {
		return obito100k;
	}

	public void setObito100k(String obito100k) {
		this.obito100k = obito100k;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((confirmado == null) ? 0 : confirmado.hashCode());
		result = prime * result + ((confirmado100k == null) ? 0 : confirmado100k.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((letalitade == null) ? 0 : letalitade.hashCode());
		result = prime * result + ((obito == null) ? 0 : obito.hashCode());
		result = prime * result + ((obito100k == null) ? 0 : obito100k.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CrawlerModel other = (CrawlerModel) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (confirmado == null) {
			if (other.confirmado != null)
				return false;
		} else if (!confirmado.equals(other.confirmado))
			return false;
		if (confirmado100k == null) {
			if (other.confirmado100k != null)
				return false;
		} else if (!confirmado100k.equals(other.confirmado100k))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (letalitade == null) {
			if (other.letalitade != null)
				return false;
		} else if (!letalitade.equals(other.letalitade))
			return false;
		if (obito == null) {
			if (other.obito != null)
				return false;
		} else if (!obito.equals(other.obito))
			return false;
		if (obito100k == null) {
			if (other.obito100k != null)
				return false;
		} else if (!obito100k.equals(other.obito100k))
			return false;
		return true;
	}
    
    
}
