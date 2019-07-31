(ns org.deeplearning4j.models.sequencevectors.transformers.impl.iterables.BasicTransformerIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.transformers.impl.iterables BasicTransformerIterator]))

(defn ->basic-transformer-iterator
  "Constructor.

  iterator - `org.deeplearning4j.text.documentiterator.LabelAwareIterator`
  transformer - `org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer`"
  (^BasicTransformerIterator [^org.deeplearning4j.text.documentiterator.LabelAwareIterator iterator ^org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer transformer]
    (new BasicTransformerIterator iterator transformer)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^BasicTransformerIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<org.deeplearning4j.models.word2vec.VocabWord>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^BasicTransformerIterator this]
    (-> this (.next))))

(defn reset
  ""
  ([^BasicTransformerIterator this]
    (-> this (.reset))))

(defn remove
  ""
  ([^BasicTransformerIterator this]
    (-> this (.remove))))

