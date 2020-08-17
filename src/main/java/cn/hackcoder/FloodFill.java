package cn.hackcoder;

import java.util.*;

/**
 * 733. Flood Fill
 */
public class FloodFill {

	static class Node {
		int rows;
		int cols;
		int row;
		int col;

		public Node(int rows, int cols, int row, int col) {
			this.rows = rows;
			this.cols = cols;
			this.row = row;
			this.col = col;
		}

		public Node left() {
			int r = row;
			int c = col - 1;
			if (c >= 0) {
				return new Node(rows, cols, r, c);
			}
			return null;
		}

		public Node right() {
			int r = row;
			int c = col + 1;
			if (c <= cols - 1) {
				return new Node(rows, cols, r, c);
			}
			return null;
		}

		public Node up() {
			int r = row - 1;
			int c = col;
			if (r >= 0) {
				return new Node(rows, cols, r, c);
			}
			return null;
		}

		public Node down() {
			int r = row + 1;
			int c = col;
			if (r <= rows - 1) {
				return new Node(rows, cols, r, c);
			}
			return null;
		}


		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Node node = (Node) o;
			return row == node.row &&
					col == node.col;
		}

		@Override
		public int hashCode() {
			return Objects.hash(row, col);
		}
	}

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		Set<Node> visited = new HashSet<>();
		int rows = image.length;
		int cols = image[0].length;
		int targetValue = image[sr][sc];

		Queue<Node> nodes = new ArrayDeque<>();
		nodes.add(new Node(rows, cols, sr, sc));
		while (!nodes.isEmpty()) {
			Node node = nodes.poll();
			visited.add(node);
			image[node.row][node.col] = newColor;

			Node left = node.left();
			Node right = node.right();
			Node up = node.up();
			Node down = node.down();

			if (left != null && isLegal(visited, left, image, targetValue)) {
				nodes.add(left);
			}
			if (right != null && isLegal(visited, right, image, targetValue)) {
				nodes.add(right);
			}
			if (up != null && isLegal(visited, up, image, targetValue)) {
				nodes.add(up);
			}
			if (down != null && isLegal(visited, down, image, targetValue)) {
				nodes.add(down);
			}
		}
		return image;
	}

	public boolean isLegal(Set<Node> visited, Node node, int[][] images, int targetValue) {
		return !visited.contains(node) && images[node.row][node.col] == targetValue;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(new FloodFill().floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2)));
		System.out.println(Arrays.deepToString(new FloodFill().floodFill(new int[][]{{0, 0, 0}, {0, 1, 1}}, 1, 1, 1)));
		System.out.println(Arrays.deepToString(new FloodFill().floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 2)));
	}


}
