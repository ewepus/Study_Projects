package Lab_work_9.Polytopes;

public class Tetrahedron extends RegularPolyhedron{
    public Tetrahedron(Integer verticesCount, Integer facesCount, Integer[] edges) {
        super(verticesCount, facesCount, edges);
    }
    public static boolean isTetrahedron(Integer verticesCount, Integer facesCount, Integer edgesCount) {
        return verticesCount == 4 && facesCount == 4 && edgesCount == 6;
    }

    @Override
    public String toString() {
        return "Tetrahedron is a Regular Vertex Polyhedron with " + getEdgesCount() + " equal edges, " + facesCount +
                " equal faces and " + verticesCount + " equal vertices";
    }
}
