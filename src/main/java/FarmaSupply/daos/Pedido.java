package FarmaSupply.daos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos", schema = "fs_logica")
public class Pedido {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido", nullable = false)
	private long idPedido;

	@Column(name = "descripcion_pedido", nullable = false, length = 70)
	private String descripcionPedido;

	@Column(name = "cantidad_pedido", nullable = false)
	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario idUsuario_Ped;

	@ManyToOne
	@JoinColumn(name = "id_tienda")
	private Tienda idPedido_Tie;

	// Constructores


	public Pedido() {
		super();
	}

	public Pedido(String descripcionPedido, Usuario idUsuario_Ped, Tienda idPedido_Tie) {
		super();
		this.descripcionPedido = descripcionPedido;
		this.idUsuario_Ped = idUsuario_Ped;
		this.idPedido_Tie = idPedido_Tie;
	}

	public long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public String getDescripcionPedido() {
		return descripcionPedido;
	}

	public void setDescripcionPedido(String descripcionPedido) {
		this.descripcionPedido = descripcionPedido;
	}

	public Usuario getIdUsuario_Ped() {
		return idUsuario_Ped;
	}

	public void setIdUsuario_Ped(Usuario idUsuario_Ped) {
		this.idUsuario_Ped = idUsuario_Ped;
	}

	public Tienda getIdPedido_Tie() {
		return idPedido_Tie;
	}

	public void setIdPedido_Tie(Tienda idPedido_Tie) {
		this.idPedido_Tie = idPedido_Tie;
	}


}
