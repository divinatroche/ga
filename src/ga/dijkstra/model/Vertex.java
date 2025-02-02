package ga.dijkstra.model;

public class Vertex {
    private String id;
    private String name;

    public Vertex(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Vertex () {
        this.id = "";
        this.name = "";
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

  public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;

        return true;

    }

    @Override
    public String toString() {
        return name;
    }

} 