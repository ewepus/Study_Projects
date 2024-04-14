package Lab_work_9.Polytopes;

public class VertexPolyhedron extends Polyhedron {
    public VertexPolyhedron(Integer verticesCount, Integer facesCount, Integer[] edges) {
        super(verticesCount, facesCount, edges);
    }

    public static boolean isVertex(Integer verticesCount, Integer facesCount, Integer edgesCount) {
        return verticesCount + facesCount - edgesCount == 2;
    }

    @Override
    public String toString() {
        return "In Vertex Polyhedron: " + verticesCount + " + " + facesCount + " - " + getEdgesCount() + " = 2";
    }
}
