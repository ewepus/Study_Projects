package Lab_work_9.Polytopes;

public class Hexahedron extends RegularPolyhedron {
    public Hexahedron(Integer verticesCount, Integer facesCount, Integer[] edges) {
        super(verticesCount, facesCount, edges);
    }

    public static boolean isHexahedron(Integer verticesCount, Integer facesCount, Integer edgesCount) {
        return verticesCount == 8 && facesCount == 6 && edgesCount == 12;
    }

    @Override
    public String toString() {
        return "Hexahedron is a Regular Vertex Polyhedron with " + getEdgesCount() + " equal edges, " + facesCount +
                " equal faces and " + verticesCount + " equal vertices";
    }
}
