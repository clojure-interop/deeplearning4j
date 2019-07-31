(ns org.deeplearning4j.text.corpora.treeparser.BinarizeTreeTransformer
  "Binarizes trees.
 Based on the work by Manning et. al in stanford corenlp"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.corpora.treeparser BinarizeTreeTransformer]))

(defn ->binarize-tree-transformer
  "Constructor."
  (^BinarizeTreeTransformer []
    (new BinarizeTreeTransformer )))

(defn transform
  "Description copied from interface: TreeTransformer

  t - the tree to applyTransformToOrigin - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`

  returns: the transformed tree - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^BinarizeTreeTransformer this ^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree t]
    (-> this (.transform t))))

