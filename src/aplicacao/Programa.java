package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Empregados;

public class Programa {

	public static void main(String[] args) {

		List<Empregados> lista = new ArrayList<>();//<<----
		String sCaminho = "C:\\Users\\rafael.souza\\Desktop\\eclipse-jee-photon-R-win32-x86_64"
				+ "\\ProjetosDoCurso\\ManipulaArqv\\in.txt";

		try (BufferedReader brEscreveArquivo = new BufferedReader(new FileReader(sCaminho))) {

			String EmpregadosCSV = brEscreveArquivo.readLine();
			while (EmpregadosCSV != null) {
				String [] sCampos = EmpregadosCSV.split(",");
				lista.add(new Empregados(sCampos [0], Double.parseDouble(sCampos [1])));
				EmpregadosCSV = brEscreveArquivo.readLine();
			}
			Collections.sort(lista);
			for (Empregados emp : lista) {
// Lista não foi declarado como <String>Lista ocorre erro que lista não é uma string
				System.out.println(emp.getsNome() + "," + emp.getdSalario());
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}
}
