package Lab_work_9.Polytopes;

import java.util.Scanner;

public class PolyhedronMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vertices count, faces count, and lengths of the edges");

        String[] string = sc.nextLine().split(" ");

        int verticesCount = Integer.parseInt(string[0]);
        int facesCount = Integer.parseInt(string[1]);
        Integer[] edges = new Integer[string.length - 2];

        for (int i = 0; i < edges.length; i++) {
            edges[i] = Integer.parseInt(string[i + 2]);
        }

        try {
            if (Polyhedron.isCorrectEdge(edges)) {
                if (VertexPolyhedron.isVertex(verticesCount, facesCount, edges.length)) {
                    if (RegularPolyhedron.isRegular(edges)) {
                        if (Tetrahedron.isTetrahedron(verticesCount, facesCount, edges.length)) {
                            Tetrahedron tetrahedron = new Tetrahedron(verticesCount, facesCount, edges);
                            System.out.println(tetrahedron);

                        } else if (Hexahedron.isHexahedron(verticesCount, facesCount, edges.length)) {
                            Hexahedron hexahedron = new Hexahedron(verticesCount, facesCount, edges);
                            System.out.println(hexahedron);

                        } else if (Octahedron.isOctahedron(verticesCount, facesCount, edges.length)) {
                            Octahedron octahedron = new Octahedron(verticesCount, facesCount, edges);
                            System.out.println(octahedron);

                        } else if (Dodecahedron.isDodecahedron(verticesCount, facesCount, edges.length)) {
                            Dodecahedron dodecahedron = new Dodecahedron(verticesCount, facesCount, edges);
                            System.out.println(dodecahedron);

                        } else if (Icosahedron.isIcosahedron(verticesCount, facesCount, edges.length)) {
                            Icosahedron icosahedron = new Icosahedron(verticesCount, facesCount, edges);
                            System.out.println(icosahedron);
                        } else {
                            RegularPolyhedron regularPolyhedron = new RegularPolyhedron(verticesCount, facesCount, edges);
                            System.out.println(regularPolyhedron);
                        }
                    } else {
                        VertexPolyhedron vertexPolyhedron = new VertexPolyhedron(verticesCount, facesCount, edges);
                        System.out.println(vertexPolyhedron);
                    }
                } else {
                    Polyhedron polyhedron = new Polyhedron(verticesCount, facesCount, edges);
                    System.out.println(polyhedron);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
