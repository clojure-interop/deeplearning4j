(ns org.deeplearning4j.text.corpora.treeparser.HeadWordFinder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.corpora.treeparser HeadWordFinder]))

(defn ->head-word-finder
  "Constructor.

  include-pp-head - `boolean`"
  (^HeadWordFinder [^Boolean include-pp-head]
    (new HeadWordFinder include-pp-head))
  (^HeadWordFinder []
    (new HeadWordFinder )))

(defn find-head
  "Finds the bottom most head

  parent-node - the bottom most head - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`

  returns: the bottom most head (no children) for the given parent - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^HeadWordFinder this ^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree parent-node]
    (-> this (.findHead parent-node))))

(defn find-head-2
  "parent-node - `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`

  returns: `org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree`"
  (^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree [^HeadWordFinder this ^org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree parent-node]
    (-> this (.findHead2 parent-node))))

