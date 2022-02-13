package co.mercadolibre.rest.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import co.mercadolibre.rest.enums.EnumDirection;

public class Planet implements Serializable {
	private static final long serialVersionUID = 8536422641714452656L;

	public Planet() {
		super();
	}

	public Planet(String name, BigDecimal angularSpeed, EnumDirection direction, BigDecimal distance) {
		super();
		this.name = name;
		this.angularSpeed = angularSpeed;

		if (direction.equals(EnumDirection.COUNTERCLOCKWISE)) {
			this.direction = BigDecimal.ONE.negate();
		} else if (direction.equals(EnumDirection.CLOCKWISE)) {
			this.direction = BigDecimal.ONE;
		}
		this.distance = distance;
	}

	private String name;
	private BigDecimal angularSpeed;
	private BigDecimal direction;
	private BigDecimal distance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getAngularSpeed() {
		return angularSpeed;
	}

	public void setAngularSpeed(BigDecimal angularSpeed) {
		this.angularSpeed = angularSpeed;
	}

	public BigDecimal getDirection() {
		return direction;
	}

	public void setDirection(BigDecimal direction) {
		this.direction = direction;
	}

	public BigDecimal getDistance() {
		return distance;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "{\"name=\"" + name + "\", \"angularSpeed\"=" + angularSpeed + ", \"direction\"=" + direction
				+ ", \"distance\"=" + distance + "}";
	}

}
