package AtivEmpresa;

public class Empresa {
	private Departamento enterprise;
	private String nome;
		
		public Empresa(String nome, Departamento enterprise) {
			this.nome =nome;
		}
		public void setNome (String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return nome;
		}
		public void setEmpresa (Departamento enterprise) {
			this.enterprise = enterprise;
		}
		public Departamento getEmpresa() {
			return enterprise;
		}

	}
