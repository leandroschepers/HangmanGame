import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WordBank {
    private List<String> words;

    public WordBank() {

        words = words = Arrays.asList(
                "cachorro", "gato", "livro", "carro", "cidade", "praia", "floresta", "escola", "amigo", "familia",
                "computador", "telefone", "janela", "porta", "festa", "comida", "bebida", "flor", "sol",
                "lua", "estrela", "mar", "montanha", "nuvem", "chuva", "neve", "vento", "terremoto", "tornado",
                "ciclo", "curso", "professor", "aluno", "licao", "atividade", "trabalho", "tarefa", "estudo",
                "conhecimento", "sabedoria", "educacao", "instrucao", "mensagem", "cartao", "foto", "imagem",
                "caneta", "lapis", "papel", "tinta", "desenho", "quadros", "musica", "canto", "danca",
                "teatro", "filme", "serie", "livraria", "biblioteca", "cultura", "arte", "religiao", "deus", "santo",
                "fe", "oracao", "espiritual", "templo", "igreja", "paz", "calma", "alegria", "felicidade", "sorriso",
                "abraco", "carinho", "solidariedade", "ajuda", "compaixao", "gentileza", "bondade", "coracao",
                "sentimento", "emocao", "mae", "pai", "filho", "irmao", "irma", "avo", "avo",
                "neto", "amiga", "companheiro", "parceiro", "colega", "profissional", "emprego", "carreira", "sucesso",
                "empresa", "chefia", "patrao", "funcionario", "salario", "reconhecimento", "gestao", "administracao",
                "negocio", "mercado", "venda", "compras", "desconto", "oferta", "preco", "quantidade",
                "comprar", "vender", "lucrar", "renda", "economia", "financas", "banco", "cartao", "dinheiro",
                "credito", "debito", "cheque", "saldo", "conta", "investimento", "capital", "imposto",
                "taxa", "juros", "lucro", "patrimonio", "divida", "parcelamento", "emprestimo", "pagar",
                "resgatar", "financiar", "parcelado", "orcamento", "despesa", "receita", "comercio", "industria",
                "tecnologia", "inovacao", "produto", "aplicativo", "software", "programa", "codigo", "engenharia",
                "informatica", "computacao", "internet", "site", "rede", "midia", "comunicacao", "informacao",
                "radio", "televisao", "noticiario", "jornais", "revistas", "imprensa", "blog", "canal",
                "plataforma", "rede social", "facebook", "twitter", "instagram", "whatsapp", "youtube",
                "ferramenta", "desenvolvedor", "programador", "engenheiro", "sistemas", "algoritmo", "aplicacao",
                "plano", "projeto", "estrategia", "gestao", "coordenacao", "lideranca"
        );
    }


    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}