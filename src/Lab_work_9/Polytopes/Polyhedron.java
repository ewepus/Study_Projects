package Lab_work_9.Polytopes;

public class Polyhedron {
    protected Integer verticesCount; //вершины
    protected Integer facesCount; //грани
    protected Integer[] edges; //рёбра (длины)

    public Polyhedron(Integer verticesCount, Integer facesCount, Integer[] edges) {
        this.setVerticesCount(verticesCount);
        this.setFacesCount(facesCount);
        this.setEdges(edges);
    }

    public Integer getEdgesCount() {
        return edges.length;
    }

    public static boolean isCorrectEdge(Integer[] edges) {
        if (edges.length < 6) {
            return false;
        }
        for (int i = 0; i < edges.length; i++) {
            if (edges[i] < 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Polyhedron contains " + getEdgesCount() + " edges";
    }

    public void setVerticesCount(Integer verticesCount) {
        if (verticesCount < 4) {
            throw new IllegalArgumentException("Invalid value. Try again");
        }
        this.verticesCount = verticesCount;
    }

    public void setFacesCount(Integer facesCount) {
        if (facesCount < 4) {
            throw new IllegalArgumentException("Invalid value. Try again");
        }
        this.facesCount = facesCount;
    }

    public void setEdges(Integer[] edges) {
        if (edges.length < 6) {
            throw new IllegalArgumentException("Invalid value. Try again");
        }
        for (int i = 0; i < edges.length; i++) {
            if (edges[i] < 1) {
                throw new IllegalArgumentException("Invalid value. Try again");
            }
        }
        this.edges = edges;
    }
}
