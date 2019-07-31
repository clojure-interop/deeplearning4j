(ns org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree
  "Tree for a recursive neural tensor network
 based on Socher et al's work."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive Tree]))

(defn ->tree
  "Constructor.

  Clone constructor (all but the children)

  tree - the tree to clone - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  (^Tree [^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree tree]
    (new Tree tree))
  (^Tree [^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree parent ^java.util.List tokens]
    (new Tree parent tokens)))

(defn set-prediction
  "prediction - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Tree this ^org.nd4j.linalg.api.ndarray.INDArray prediction]
    (-> this (.setPrediction prediction))))

(defn pre-terminal?
  "Node has one child that is a leaf

  returns: whether the node has one child and the child is a leaf - `boolean`"
  (^Boolean [^Tree this]
    (-> this (.isPreTerminal))))

(defn get-children
  "returns: `java.util.List<org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree>`"
  (^java.util.List [^Tree this]
    (-> this (.getChildren))))

(defn set-parent
  "parent - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  ([^Tree this ^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree parent]
    (-> this (.setParent parent))))

(defn yield
  "Returns all of the labels for this node and all of its children (recursively)

  returns: all of the labels of this node and its children recursively - `java.util.List<java.lang.String>`"
  (^java.util.List [^Tree this]
    (-> this (.yield))))

(defn get-type
  "The type of node; mainly extra meta data

  returns: `java.lang.String`"
  (^java.lang.String [^Tree this]
    (-> this (.getType))))

(defn set-tokens
  "tokens - `java.util.List`"
  ([^Tree this ^java.util.List tokens]
    (-> this (.setTokens tokens))))

(defn get-begin
  "returns: `int`"
  (^Integer [^Tree this]
    (-> this (.getBegin))))

(defn get-tokens
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Tree this]
    (-> this (.getTokens))))

(defn gold-label
  "returns: `int`"
  (^Integer [^Tree this]
    (-> this (.goldLabel))))

(defn set-type
  "type - `java.lang.String`"
  ([^Tree this ^java.lang.String type]
    (-> this (.setType type))))

(defn label
  "returns: `java.lang.String`"
  (^java.lang.String [^Tree this]
    (-> this (.label))))

(defn set-gold-label
  "gold-label - `int`"
  ([^Tree this ^Integer gold-label]
    (-> this (.setGoldLabel gold-label))))

(defn parent
  "Returns the parent of the passed in tree via traversal

  root - the root node - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`

  returns: the tree to traverse - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^Tree this ^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree root]
    (-> this (.parent root)))
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^Tree this]
    (-> this (.parent))))

(defn children
  "returns: `java.util.List<org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree>`"
  (^java.util.List [^Tree this]
    (-> this (.children))))

(defn tags
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Tree this]
    (-> this (.tags))))

(defn error
  "Returns the prediction error for this node

  returns: the prediction error for this node - `double`"
  (^Double [^Tree this]
    (-> this (.error))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Tree this]
    (-> this (.toString))))

(defn set-error
  "error - `double`"
  ([^Tree this ^Double error]
    (-> this (.setError error))))

(defn ancestor
  "Returns the ancestor of the given tree

  height - `int`
  root - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`

  returns: Tree - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^Tree this ^Integer height ^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree root]
    (-> this (.ancestor height root))))

(defn last-child
  "returns: `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^Tree this]
    (-> this (.lastChild))))

(defn leaf?
  "Returns whether the node has any children or not

  returns: whether the node has any children or not - `boolean`"
  (^Boolean [^Tree this]
    (-> this (.isLeaf))))

(defn get-head-word
  "returns: `java.lang.String`"
  (^java.lang.String [^Tree this]
    (-> this (.getHeadWord))))

(defn value
  "returns: `java.lang.String`"
  (^java.lang.String [^Tree this]
    (-> this (.value))))

(defn connect
  "Connects the given trees
  and sets the parents of the children

  children - the children to connect with - `java.util.List`"
  ([^Tree this ^java.util.List children]
    (-> this (.connect children))))

(defn set-begin
  "begin - `int`"
  ([^Tree this ^Integer begin]
    (-> this (.setBegin begin))))

(defn vector
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Tree this]
    (-> this (.vector))))

(defn set-parse
  "parse - `java.lang.String`"
  ([^Tree this ^java.lang.String parse]
    (-> this (.setParse parse))))

(defn get-end
  "returns: `int`"
  (^Integer [^Tree this]
    (-> this (.getEnd))))

(defn set-tags
  "tags - `java.util.List`"
  ([^Tree this ^java.util.List tags]
    (-> this (.setTags tags))))

(defn set-end
  "end - `int`"
  ([^Tree this ^Integer end]
    (-> this (.setEnd end))))

(defn first-child
  "returns: `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^Tree this]
    (-> this (.firstChild))))

(defn set-vector
  "vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Tree this ^org.nd4j.linalg.api.ndarray.INDArray vector]
    (-> this (.setVector vector))))

(defn error-sum
  "Returns the total prediction error for this
  tree and its children

  returns: the total error for this tree and its children - `double`"
  (^Double [^Tree this]
    (-> this (.errorSum))))

(defn prediction
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Tree this]
    (-> this (.prediction))))

(defn set-value
  "value - `java.lang.String`"
  ([^Tree this ^java.lang.String value]
    (-> this (.setValue value))))

(defn depth
  "Returns the distance between this node
  and the specified subnode

  node - the node to get the distance from - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`

  returns: the distance between the 2 nodes - `int`"
  (^Integer [^Tree this ^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree node]
    (-> this (.depth node)))
  (^Integer [^Tree this]
    (-> this (.depth))))

(defn clone
  "returns: `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^Tree this]
    (-> this (.clone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Tree this]
    (-> this (.hashCode))))

(defn set-head-word
  "head-word - `java.lang.String`"
  ([^Tree this ^java.lang.String head-word]
    (-> this (.setHeadWord head-word))))

(defn get-leaves
  "Gets the leaves of the tree.

  list - The list in which the leaves of the tree will beplaced. Normally, this will be empty when the routine is called,but if not, the new yield is added to the end of the list. - `java.util.List`

  returns: a List of the leaves. - `<T extends org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree> java.util.List<T>`"
  ([^Tree this ^java.util.List list]
    (-> this (.getLeaves list)))
  ([^Tree this]
    (-> this (.getLeaves))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Tree this ^java.lang.Object o]
    (-> this (.equals o))))

(defn set-label
  "label - `java.lang.String`"
  ([^Tree this ^java.lang.String label]
    (-> this (.setLabel label))))

