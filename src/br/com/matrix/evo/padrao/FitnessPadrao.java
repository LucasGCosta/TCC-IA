<<<<<<< HEAD
package br.com.matrix.evo.padrao;

import br.com.matrix.evo.suporte.FitnessEvo;

/**
 * Fitness Padronizado.
 *
 */
public class FitnessPadrao implements FitnessEvo {

	Double d;

	/**
	 * Fitness bruto, sem tratamentos.
	 * 
	 * @param d
	 *            - Valor bruto do fitnes.
	 */
	public FitnessPadrao(Double d) {
		this.d = d;
	}

	/**
	 * Fitness recebe a diferenša em modulo do objetivo e do valor bruto.
	 * 
	 * @param d
	 *            - Valor bruto do fitness
	 * @param o
	 *            - Valor objetivo
	 */
	public FitnessPadrao(Double d, Double o) {
		Double a = o - d;

		if (a < 0) {
			a *= -1;
		}

		this.d = a;
	}

	@Override
	public Double get() {
		return d;
	}

}
=======
package br.com.matrix.evo.padrao;

import br.com.matrix.evo.suporte.FitnessEvo;

/**
 * Fitness Padronizado.
 *
 */
public class FitnessPadrao implements FitnessEvo {

	Double d;

	/**
	 * Fitness bruto, sem tratamentos.
	 * 
	 * @param d
	 *            - Valor bruto do fitnes.
	 */
	public FitnessPadrao(Double d) {
		this.d = d;
	}

	/**
	 * Fitness recebe a diferenša em modulo do objetivo e do valor bruto.
	 * 
	 * @param d
	 *            - Valor bruto do fitness
	 * @param o
	 *            - Valor objetivo
	 */
	public FitnessPadrao(Double d, Double o) {
		Double a = o - d;

		if (a < 0) {
			a *= -1;
		}

		this.d = a;
	}

	@Override
	public Double get() {
		return d;
	}

}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
