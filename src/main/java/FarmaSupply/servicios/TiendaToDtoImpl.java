package FarmaSupply.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import FarmaSupply.daos.Tienda;
import FarmaSupply.dtos.TiendaDTO;

@Service
public class TiendaToDtoImpl implements ITiendaToDto {

	@Override
	public TiendaDTO tiendaToDto(Tienda t) {
		try {
			TiendaDTO dto = new TiendaDTO();
			dto.setId(t.getIdTienda());
			dto.setNombreTienda(t.getNombreTienda());
			dto.setDireccionTienda(t.getDireccionTienda());
			dto.setCodigopostalTienda(t.getCodigopostalTienda());
			
			
			
			return dto;
		} catch (Exception e) {
			System.out.println(
					"\n[ERROR TiendaToDtoImpl - tiendaToDto()] - Error al convertir tiendaDAO a tiendaDTO (return null): "
							+ e);
			return null;
		}
	}

	@Override
	public List<TiendaDTO> listaTiendaToDto(List<Tienda> listaTienda) {
		try {
			
			List<TiendaDTO> listaDto = new ArrayList<>();
			for (Tienda t : listaTienda) {
				listaDto.add(this.tiendaToDto(t));
			}
			return listaDto;

		} catch (Exception e) {
			System.out.println(
					"\n[ERROR TiendaToDtoImpl - listaTiendaToDto()] - Error al convertir lista de tiendaDAO a lista de tiendaDTO (return null): "
							+ e);
		}
		return null;
	}
	

}
