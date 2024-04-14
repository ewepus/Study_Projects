package Lab_work_9.Polytopes;

public class Icosahedron extends RegularPolyhedron {
    public Icosahedron(Integer verticesCount, Integer facesCount, Integer[] edges) {
        super(verticesCount, facesCount, edges);
    }

    public static boolean isIcosahedron(Integer verticesCount, Integer facesCount, Integer edgesCount) {
        return verticesCount == 12 && facesCount == 20 && edgesCount == 30;
    }

    @Override
    public String toString() {
        return "Icosahedron is a Regular Vertex Polyhedron with " + getEdgesCount() + " equal edges, " + facesCount +
                " equal faces and " + verticesCount + " equal vertices";
    }
}
