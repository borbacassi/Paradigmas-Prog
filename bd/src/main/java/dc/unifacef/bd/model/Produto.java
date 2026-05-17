package dc.unifacef.bd.model;
@Entity
@Table(name="produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private String nome;
    @Column (nullable = false)
    private Double preco;
    @Column (length = 255)
    private String descricao;

}
