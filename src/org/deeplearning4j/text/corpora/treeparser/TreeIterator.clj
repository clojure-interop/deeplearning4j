(ns org.deeplearning4j.text.corpora.treeparser.TreeIterator
  "Tree iterator: iterate over sentences
 returning trees with labels and everything already
 preset"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.corpora.treeparser TreeIterator]))

(defn ->tree-iterator
  "Constructor.

  sentence-iterator - `org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareSentenceIterator`
  labels - `java.util.List`
  tree-vectorizer - `org.deeplearning4j.text.corpora.treeparser.TreeVectorizer`
  batch-size - `int`"
  (^TreeIterator [^org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareSentenceIterator sentence-iterator ^java.util.List labels ^org.deeplearning4j.text.corpora.treeparser.TreeVectorizer tree-vectorizer ^Integer batch-size]
    (new TreeIterator sentence-iterator labels tree-vectorizer batch-size))
  (^TreeIterator [^org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareSentenceIterator sentence-iterator ^java.util.List labels ^org.deeplearning4j.text.corpora.treeparser.TreeVectorizer tree-vectorizer]
    (new TreeIterator sentence-iterator labels tree-vectorizer))
  (^TreeIterator [^org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareSentenceIterator sentence-iterator ^java.util.List labels]
    (new TreeIterator sentence-iterator labels)))

(defn has-next?
  "Returns true if the iteration has more elements.
  (In other words, returns true if next() would
  return an element rather than throwing an exception.)

  returns: true if the iteration has more elements - `boolean`"
  (^Boolean [^TreeIterator this]
    (-> this (.hasNext))))

(defn next
  "Returns the next element in the iteration.

  returns: the next element in the iteration - `java.util.List<org.deeplearning4j.nn.layers.feedforward.autoencoder.recursive.Tree>`"
  (^java.util.List [^TreeIterator this]
    (-> this (.next))))

(defn remove
  "Removes from the underlying collection the last element returned
  by this iterator (optional operation). This method can be called
  only once per call to next(). The behavior of an iterator
  is unspecified if the underlying collection is modified while the
  iteration is in progress in any way other than by calling this
  method.

  throws: java.lang.UnsupportedOperationException - if the removeoperation is not supported by this iterator"
  ([^TreeIterator this]
    (-> this (.remove))))

