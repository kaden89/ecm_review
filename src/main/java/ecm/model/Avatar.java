package ecm.model;

import javax.persistence.*;

/**
 * Модель аватара класса {@link Person}
 * @author dkarachurin
 */
@Entity
public class Avatar {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    @Lob
    private byte[] image;

    private Integer ownerId;

    public Avatar() {
    }

    public Avatar(Integer ownerId, byte[] image) {
        this.image = image;
        this.ownerId = ownerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
