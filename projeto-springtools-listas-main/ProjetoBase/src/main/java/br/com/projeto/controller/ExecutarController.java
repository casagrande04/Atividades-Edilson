package br.com.projeto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.model.Book;

@RestController
public class ExecutarController {

	@GetMapping("/primeiro")
	public List<String> primeiro() {
		// array de strings
		String[] strArray = { "Delhi", "Mumbai", "Kolkata", "Chennai" };
		// inicializa uma lista imutavel do array usando o metodo asList
		List<String> mylist = Arrays.asList(strArray);
		// mostra a lista
		return mylist;
	}

	@GetMapping("/segundo")
	public List<String> segundo() {

		List<String> list = new ArrayList<String>();
		// adicionando elementos na lista
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		return list;

	}

	@GetMapping("/terceiro")
	public List<Book> terceiro() {
		// criando a lista dos livros
		List<Book> list = new ArrayList<Book>();
		// criando os livros
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		// adicionando os livros na lista
		list.add(b1);
		list.add(b2);
		list.add(b3);
		return list;

	}
}
