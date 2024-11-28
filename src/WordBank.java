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
                "ciclo", "curso", "professor", "aluno", "lição", "atividade", "trabalho", "tarefa", "estudo",
                "conhecimento", "sabedoria", "educação", "instrução", "mensagem", "cartão", "foto", "imagem",
                "caneta", "lápis", "papel", "tinta", "desenho", "quadros", "música", "canto", "dança",
                "teatro", "filme", "série", "livraria", "biblioteca", "cultura", "arte", "religião", "deus", "santo",
                "fé", "oração", "espiritual", "templo", "igreja", "paz", "calma", "alegria", "felicidade", "sorriso",
                "abraço", "carinho", "solidariedade", "ajuda", "compaixão", "gentileza", "bondade", "coração",
                "sentimento", "emoção", "mãe", "pai", "filho", "irmão", "irmã", "avô", "avó",
                "neto", "amiga", "companheiro", "parceiro", "colega", "profissional", "emprego", "carreira", "sucesso",
                "empresa", "chefia", "patrão", "funcionário", "salário", "reconhecimento", "gestão", "administração",
                "negócio", "mercado", "venda", "compras", "desconto", "oferta", "preço", "quantidade",
                "comprar", "vender", "lucrar", "renda", "economia", "finanças", "banco", "cartão", "dinheiro",
                "credito", "débito", "cheque", "saldo", "conta", "investimento", "capital", "imposto",
                "taxa", "juros", "lucro", "patrimônio", "dívida", "parcelamento", "emprestimo", "pagar",
                "resgatar", "financiar", "parcelado", "orçamento", "despesa", "receita", "comércio", "indústria",
                "tecnologia", "inovação", "produto", "aplicativo", "software", "programa", "código", "engenharia",
                "informática", "computação", "internet", "site", "rede", "mídia", "comunicação", "informação",
                "rádio", "televisão", "noticiário", "jornais", "revistas", "imprensa", "blog", "canal",
                "plataforma", "rede social", "facebook", "twitter", "instagram", "whatsapp", "youtube",
                "ferramenta", "desenvolvedor", "programador", "engenheiro", "sistemas", "algoritmo", "aplicação",
                "plano", "projeto", "estratégia", "gestão", "coordenação", "liderança"
        );
    }


    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}