(ns org.deeplearning4j.clustering.sptree.SpTree
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.sptree SpTree]))

(defn ->sp-tree
  "Constructor.

  parent - `org.deeplearning4j.clustering.sptree.SpTree`
  data - `org.nd4j.linalg.api.ndarray.INDArray`
  corner - `org.nd4j.linalg.api.ndarray.INDArray`
  width - `org.nd4j.linalg.api.ndarray.INDArray`
  indices - `java.util.Set`
  similarity-function - `java.lang.String`"
  (^SpTree [^org.deeplearning4j.clustering.sptree.SpTree parent ^org.nd4j.linalg.api.ndarray.INDArray data ^org.nd4j.linalg.api.ndarray.INDArray corner ^org.nd4j.linalg.api.ndarray.INDArray width ^java.util.Set indices ^java.lang.String similarity-function]
    (new SpTree parent data corner width indices similarity-function))
  (^SpTree [^org.deeplearning4j.clustering.sptree.SpTree parent ^org.nd4j.linalg.api.ndarray.INDArray data ^org.nd4j.linalg.api.ndarray.INDArray corner ^org.nd4j.linalg.api.ndarray.INDArray width ^java.util.Set indices]
    (new SpTree parent data corner width indices))
  (^SpTree [^org.nd4j.linalg.api.ndarray.INDArray data ^java.util.Set indices ^java.lang.String similarity-function]
    (new SpTree data indices similarity-function))
  (^SpTree [^org.nd4j.linalg.api.ndarray.INDArray data ^java.util.Set indices]
    (new SpTree data indices))
  (^SpTree [^org.nd4j.linalg.api.ndarray.INDArray data]
    (new SpTree data)))

(def *-workspace-external
  "Static Constant.

  type: java.lang.String"
  SpTree/workspaceExternal)

(def *-node-ratio
  "Static Constant.

  type: int"
  SpTree/NODE_RATIO)

(def *-workspace-configuration-cache
  "Static Constant.

  type: org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration"
  SpTree/workspaceConfigurationCache)

(defn compute-edge-forces
  "Compute edge forces using barnes hut

  row-p - a vector - `org.nd4j.linalg.api.ndarray.INDArray`
  col-p - `org.nd4j.linalg.api.ndarray.INDArray`
  val-p - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `int`
  pos-f - the positive force - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SpTree this ^org.nd4j.linalg.api.ndarray.INDArray row-p ^org.nd4j.linalg.api.ndarray.INDArray col-p ^org.nd4j.linalg.api.ndarray.INDArray val-p ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray pos-f]
    (-> this (.computeEdgeForces row-p col-p val-p n pos-f))))

(defn get-children
  "returns: `org.deeplearning4j.clustering.sptree.SpTree[]`"
  ([^SpTree this]
    (-> this (.getChildren))))

(defn get-center-of-mass
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SpTree this]
    (-> this (.getCenterOfMass))))

(defn get-index
  "returns: `int[]`"
  ([^SpTree this]
    (-> this (.getIndex))))

(defn get-cum-size
  "returns: `int`"
  (^Integer [^SpTree this]
    (-> this (.getCumSize))))

(defn get-boundary
  "returns: `org.deeplearning4j.clustering.sptree.Cell`"
  (^org.deeplearning4j.clustering.sptree.Cell [^SpTree this]
    (-> this (.getBoundary))))

(defn compute-non-edge-forces
  "Compute non edge forces using barnes hut

  point-index - `int`
  theta - `double`
  negative-force - `org.nd4j.linalg.api.ndarray.INDArray`
  sum-q - `com.google.common.util.concurrent.AtomicDouble`"
  ([^SpTree this ^Integer point-index ^Double theta ^org.nd4j.linalg.api.ndarray.INDArray negative-force ^com.google.common.util.concurrent.AtomicDouble sum-q]
    (-> this (.computeNonEdgeForces point-index theta negative-force sum-q))))

(defn set-num-children
  "num-children - `int`"
  ([^SpTree this ^Integer num-children]
    (-> this (.setNumChildren num-children))))

(defn get-d
  "returns: `int`"
  (^Integer [^SpTree this]
    (-> this (.getD))))

(defn set-cum-size
  "cum-size - `int`"
  ([^SpTree this ^Integer cum-size]
    (-> this (.setCumSize cum-size))))

(defn leaf?
  "returns: `boolean`"
  (^Boolean [^SpTree this]
    (-> this (.isLeaf))))

(defn workspace
  "returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^SpTree this]
    (-> this (.workspace))))

(defn correct?
  "Verifies the structure of the tree (does bounds checking on each node)

  returns: true if the structure of the tree
  is correct. - `boolean`"
  (^Boolean [^SpTree this]
    (-> this (.isCorrect))))

(defn get-num-children
  "returns: `int`"
  (^Integer [^SpTree this]
    (-> this (.getNumChildren))))

(defn depth
  "The depth of the node

  returns: the depth of the node - `int`"
  (^Integer [^SpTree this]
    (-> this (.depth))))

(defn sub-divide
  "Subdivide the node in to
  4 children"
  ([^SpTree this]
    (-> this (.subDivide))))

