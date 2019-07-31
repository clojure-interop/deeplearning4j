(ns org.deeplearning4j.text.corpora.treeparser.TreeVectorizer
  "Tree vectorization pipeline. Takes a word vector model (as a lookup table)
 and a parser and handles vectorization of strings appropriate for an RNTN"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.corpora.treeparser TreeVectorizer]))

(defn ->tree-vectorizer
  "Constructor.

  Uses the given parser and model
  for vectorization of strings

  parser - the parser to use for convertingstrings to trees - `org.deeplearning4j.text.corpora.treeparser.TreeParser`"
  (^TreeVectorizer [^org.deeplearning4j.text.corpora.treeparser.TreeParser parser]
    (new TreeVectorizer parser))
  (^TreeVectorizer []
    (new TreeVectorizer )))

(defn get-trees
  "Vectorizes the passed in sentences

  sentences - the sentences to convert to trees - `java.lang.String`

  returns: a list of trees pre converted with CNF and
  binarized and word vectors at the leaves of the trees - `java.util.List<org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree>`

  throws: java.lang.Exception"
  (^java.util.List [^TreeVectorizer this ^java.lang.String sentences]
    (-> this (.getTrees sentences))))

(defn get-trees-with-labels
  "Vectorizes the passed in sentences

  sentences - the sentences to convert to trees - `java.lang.String`
  label - the label for the sentence - `java.lang.String`
  labels - all of the possible labels for the trees - `java.util.List`

  returns: a list of trees pre converted with CNF and
  binarized and word vectors at the leaves of the trees - `java.util.List<org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree>`

  throws: java.lang.Exception"
  (^java.util.List [^TreeVectorizer this ^java.lang.String sentences ^java.lang.String label ^java.util.List labels]
    (-> this (.getTreesWithLabels sentences label labels)))
  (^java.util.List [^TreeVectorizer this ^java.lang.String sentences ^java.util.List labels]
    (-> this (.getTreesWithLabels sentences labels))))

