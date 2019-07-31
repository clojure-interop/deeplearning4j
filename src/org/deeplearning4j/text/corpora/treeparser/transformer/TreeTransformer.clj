(ns org.deeplearning4j.text.corpora.treeparser.transformer.TreeTransformer
  "Tree transformer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.corpora.treeparser.transformer TreeTransformer]))

(defn transform
  "Applies a applyTransformToOrigin to a tree

  t - the tree to applyTransformToOrigin - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`

  returns: the transformed tree - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^TreeTransformer this ^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree t]
    (-> this (.transform t))))

