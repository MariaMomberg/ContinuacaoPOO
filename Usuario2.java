package aula3;

public class Usuario2 {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		usuario.setId(442);
		usuario.setNome("Maria Momberg");
		usuario.setPassword(2308);
		usuario.setPermissao("0 usuário comum");
		usuario.setUsuario("malu_momberg");
		
		System.out.println("Usuário");
		System.out.println(usuario.getId());
		System.out.println(usuario.getNome());
		System.out.println(usuario.getPassword()); 
		System.out.println(usuario.getPermissao());
		System.out.println(usuario.getUsuario()); 
		
		usuario.acessar(2308);
		usuario.inserir();
		usuario.mostrarPermissao();
	}
}

