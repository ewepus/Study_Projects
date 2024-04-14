package Lab_work_9.Polytopes;

public class RegularPolyhedron extends VertexPolyhedron {
    public RegularPolyhedron(Integer verticesCount, Integer facesCount, Integer[] edges) {
        super(verticesCount, facesCount, edges);
    }

    public static boolean isRegular(Integer[] edges) {
        int length = edges[0];
        for (Integer edge : edges) {
            if (edge != length) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString() {
        return "In Regular Vertex Polyhedron all " + getEdgesCount() + " edges, " + facesCount +
                " faces and " + verticesCount + " vertices are equal";
    }
}
