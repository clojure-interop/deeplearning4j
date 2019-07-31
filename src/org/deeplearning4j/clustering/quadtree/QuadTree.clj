(ns org.deeplearning4j.clustering.quadtree.QuadTree
  "QuadTree: http://en.wikipedia.org/wiki/Quadtree
 Reference impl based on the paper by:
 http://arxiv.org/pdf/1301.3342v2.pdf
 Primarily focused on 2 dimensions, may expand later if there's a reason."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.quadtree QuadTree]))

(defn ->quad-tree
  "Constructor.

  Pass in a matrix

  data - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^QuadTree [^org.nd4j.linalg.api.ndarray.INDArray data]
    (new QuadTree data))
  (^QuadTree [^org.deeplearning4j.clustering.quadtree.QuadTree parent ^org.nd4j.linalg.api.ndarray.INDArray data ^org.deeplearning4j.clustering.quadtree.Cell boundary]
    (new QuadTree parent data boundary)))

(defn compute-edge-forces
  "row-p - a vector - `org.nd4j.linalg.api.ndarray.INDArray`
  col-p - `org.nd4j.linalg.api.ndarray.INDArray`
  val-p - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `int`
  pos-f - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^QuadTree this ^org.nd4j.linalg.api.ndarray.INDArray row-p ^org.nd4j.linalg.api.ndarray.INDArray col-p ^org.nd4j.linalg.api.ndarray.INDArray val-p ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray pos-f]
    (-> this (.computeEdgeForces row-p col-p val-p n pos-f))))

(defn set-south-east
  "south-east - `org.deeplearning4j.clustering.quadtree.QuadTree`"
  ([^QuadTree this ^org.deeplearning4j.clustering.quadtree.QuadTree south-east]
    (-> this (.setSouthEast south-east))))

(defn set-parent
  "parent - `org.deeplearning4j.clustering.quadtree.QuadTree`"
  ([^QuadTree this ^org.deeplearning4j.clustering.quadtree.QuadTree parent]
    (-> this (.setParent parent))))

(defn set-north-west
  "north-west - `org.deeplearning4j.clustering.quadtree.QuadTree`"
  ([^QuadTree this ^org.deeplearning4j.clustering.quadtree.QuadTree north-west]
    (-> this (.setNorthWest north-west))))

(defn get-center-of-mass
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^QuadTree this]
    (-> this (.getCenterOfMass))))

(defn get-south-east
  "returns: `org.deeplearning4j.clustering.quadtree.QuadTree`"
  (^org.deeplearning4j.clustering.quadtree.QuadTree [^QuadTree this]
    (-> this (.getSouthEast))))

(defn set-center-of-mass
  "center-of-mass - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^QuadTree this ^org.nd4j.linalg.api.ndarray.INDArray center-of-mass]
    (-> this (.setCenterOfMass center-of-mass))))

(defn get-cum-size
  "returns: `int`"
  (^Integer [^QuadTree this]
    (-> this (.getCumSize))))

(defn get-boundary
  "returns: `org.deeplearning4j.clustering.quadtree.Cell`"
  (^org.deeplearning4j.clustering.quadtree.Cell [^QuadTree this]
    (-> this (.getBoundary))))

(defn compute-non-edge-forces
  "Compute non edge forces using barnes hut

  point-index - `int`
  theta - `double`
  negative-force - `org.nd4j.linalg.api.ndarray.INDArray`
  sum-q - `com.google.common.util.concurrent.AtomicDouble`"
  ([^QuadTree this ^Integer point-index ^Double theta ^org.nd4j.linalg.api.ndarray.INDArray negative-force ^com.google.common.util.concurrent.AtomicDouble sum-q]
    (-> this (.computeNonEdgeForces point-index theta negative-force sum-q))))

(defn get-south-west
  "returns: `org.deeplearning4j.clustering.quadtree.QuadTree`"
  (^org.deeplearning4j.clustering.quadtree.QuadTree [^QuadTree this]
    (-> this (.getSouthWest))))

(defn get-north-west
  "returns: `org.deeplearning4j.clustering.quadtree.QuadTree`"
  (^org.deeplearning4j.clustering.quadtree.QuadTree [^QuadTree this]
    (-> this (.getNorthWest))))

(defn set-boundary
  "boundary - `org.deeplearning4j.clustering.quadtree.Cell`"
  ([^QuadTree this ^org.deeplearning4j.clustering.quadtree.Cell boundary]
    (-> this (.setBoundary boundary))))

(defn set-cum-size
  "cum-size - `int`"
  ([^QuadTree this ^Integer cum-size]
    (-> this (.setCumSize cum-size))))

(defn leaf?
  "returns: `boolean`"
  (^Boolean [^QuadTree this]
    (-> this (.isLeaf))))

(defn get-parent
  "returns: `org.deeplearning4j.clustering.quadtree.QuadTree`"
  (^org.deeplearning4j.clustering.quadtree.QuadTree [^QuadTree this]
    (-> this (.getParent))))

(defn set-north-east
  "north-east - `org.deeplearning4j.clustering.quadtree.QuadTree`"
  ([^QuadTree this ^org.deeplearning4j.clustering.quadtree.QuadTree north-east]
    (-> this (.setNorthEast north-east))))

(defn get-north-east
  "returns: `org.deeplearning4j.clustering.quadtree.QuadTree`"
  (^org.deeplearning4j.clustering.quadtree.QuadTree [^QuadTree this]
    (-> this (.getNorthEast))))

(defn correct?
  "Returns whether the tree is consistent or not

  returns: whether the tree is consistent or not - `boolean`"
  (^Boolean [^QuadTree this]
    (-> this (.isCorrect))))

(defn depth
  "The depth of the node

  returns: the depth of the node - `int`"
  (^Integer [^QuadTree this]
    (-> this (.depth))))

(defn set-size
  "size - `int`"
  ([^QuadTree this ^Integer size]
    (-> this (.setSize size))))

(defn insert
  "Insert an index of the data in to the tree

  new-index - the index to insert in to the tree - `int`

  returns: whether the index was inserted or not - `boolean`"
  (^Boolean [^QuadTree this ^Integer new-index]
    (-> this (.insert new-index))))

(defn sub-divide
  "Create four children
  which fully divide this cell
  into four quads of equal area"
  ([^QuadTree this]
    (-> this (.subDivide))))

(defn set-leaf
  "is-leaf - `boolean`"
  ([^QuadTree this ^Boolean is-leaf]
    (-> this (.setLeaf is-leaf))))

(defn set-south-west
  "south-west - `org.deeplearning4j.clustering.quadtree.QuadTree`"
  ([^QuadTree this ^org.deeplearning4j.clustering.quadtree.QuadTree south-west]
    (-> this (.setSouthWest south-west))))

(defn get-size
  "returns: `int`"
  (^Integer [^QuadTree this]
    (-> this (.getSize))))

