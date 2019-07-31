(ns org.deeplearning4j.text.corpora.treeparser.CollapseUnaries
  "Collapse unaries such that the
 tree is only made of preterminals and leaves."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.corpora.treeparser CollapseUnaries]))

(defn ->collapse-unaries
  "Constructor."
  (^CollapseUnaries []
    (new CollapseUnaries )))

(defn transform
  "Description copied from interface: TreeTransformer

  tree - the tree to applyTransformToOrigin - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`

  returns: the transformed tree - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^CollapseUnaries this ^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree tree]
    (-> this (.transform tree))))

