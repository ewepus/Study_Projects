package Lab_work_9.Polytopes;

public class Octahedron extends RegularPolyhedron {
    public Octahedron(Integer verticesCount, Integer facesCount, Integer[] edges) {
        super(verticesCount, facesCount, edges);
    }

    public static boolean isOctahedron(Integer verticesCount, Integer facesCount, Integer edgesCount) {
        return verticesCount == 6 && facesCount == 8 && edgesCount == 12;
    }

    @Override
    public String toString() {
        return "Octahedron is a Regular Vertex Polyhedron with " + getEdgesCount() + " equal edges, " + facesCount +
                " equal faces and " + verticesCount + " equal vertices";
    }
}
