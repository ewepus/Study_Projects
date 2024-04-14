package Lab_work_9.Polytopes;

public class Dodecahedron extends RegularPolyhedron {
    public Dodecahedron(Integer verticesCount, Integer facesCount, Integer[] edges) {
        super(verticesCount, facesCount, edges);
    }

    public static boolean isDodecahedron(Integer verticesCount, Integer facesCount, Integer edgesCount) {
        return verticesCount == 20 && facesCount == 12 && edgesCount == 30;
    }

    @Override
    public String toString() {
        return "Dodecahedron is a Regular Vertex Polyhedron with " + getEdgesCount() + " equal edges, " + facesCount +
                " equal faces and " + verticesCount + " equal vertices";
    }
}
