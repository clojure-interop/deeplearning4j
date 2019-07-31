(ns org.deeplearning4j.text.corpora.treeparser.TreeFactory
  "Static movingwindow class handling the conversion of
 treebank nodes to Trees useful
 for recursive neural tensor networks"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.corpora.treeparser TreeFactory]))

(defn *build-tree
  "Builds a tree recursively
  adding the children as necessary

  node - the node to build the tree based on - `org.cleartk.syntax.constituent.type.TreebankNode`
  labels - the labels to assign for each span - `org.nd4j.linalg.primitives.Pair`
  possible-labels - `java.util.List`

  returns: the compiled tree with all of its children
  and childrens' children recursively - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`

  throws: java.lang.Exception"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^org.cleartk.syntax.constituent.type.TreebankNode node ^org.nd4j.linalg.primitives.Pair labels ^java.util.List possible-labels]
    (TreeFactory/buildTree node labels possible-labels))
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^org.cleartk.syntax.constituent.type.TreebankNode node]
    (TreeFactory/buildTree node)))

(defn *to-tree
  "Converts a treebank node to a tree

  node - the node to convert - `org.cleartk.syntax.constituent.type.TreebankNode`
  labels - the labels to assign for each span - `org.nd4j.linalg.primitives.Pair`

  returns: the tree with the same tokens and type as
  the given tree bank node - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`

  throws: java.lang.Exception"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^org.cleartk.syntax.constituent.type.TreebankNode node ^org.nd4j.linalg.primitives.Pair labels]
    (TreeFactory/toTree node labels))
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^org.cleartk.syntax.constituent.type.TreebankNode node]
    (TreeFactory/toTree node)))

