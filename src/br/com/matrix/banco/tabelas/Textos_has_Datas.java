<<<<<<< HEAD
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.ColunaFk;

public class Textos_has_Datas extends ATabela {

	private Textos_has_Datas() {
		super("Textos_has_Datas", "thd");

		getDependecias().add(new ColunaFk(Textos.get().getId(), "id_t", this));
		getDependecias().add(new ColunaFk(Datas.get().getId(), "id_d", this));

		getColunas().addAll(getDependecias());
	}

	/**
	 * referÍncia da tabela
	 */
	private static Textos_has_Datas ref;

	public static Textos_has_Datas get() {
		return (ref == null) ? ref = new Textos_has_Datas() : ref;
	}

}
=======
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.ColunaFk;

public class Textos_has_Datas extends ATabela {

	private Textos_has_Datas() {
		super("Textos_has_Datas", "thd");

		getDependecias().add(new ColunaFk(Textos.get().getId(), "id_t", this));
		getDependecias().add(new ColunaFk(Datas.get().getId(), "id_d", this));

		getColunas().addAll(getDependecias());
	}

	/**
	 * referÍncia da tabela
	 */
	private static Textos_has_Datas ref;

	public static Textos_has_Datas get() {
		return (ref == null) ? ref = new Textos_has_Datas() : ref;
	}

}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
