(ns org.deeplearning4j.models.sequencevectors.transformers.impl.iterables.ParallelTransformerIterator
  "TransformerIterator implementation that's does transformation/tokenization/normalization/whatever in parallel threads.
 Suitable for cases when tokenization takes too much time for single thread.
 TL/DR: we read data from sentence iterator, and apply tokenization in parallel threads."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.transformers.impl.iterables ParallelTransformerIterator]))

(defn ->parallel-transformer-iterator
  "Constructor.

  iterator - `org.deeplearning4j.text.documentiterator.LabelAwareIterator`
  transformer - `org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer`
  allow-multithreading - `boolean`"
  (^ParallelTransformerIterator [^org.deeplearning4j.text.documentiterator.LabelAwareIterator iterator ^org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer transformer ^Boolean allow-multithreading]
    (new ParallelTransformerIterator iterator transformer allow-multithreading))
  (^ParallelTransformerIterator [^org.deeplearning4j.text.documentiterator.LabelAwareIterator iterator ^org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer transformer]
    (new ParallelTransformerIterator iterator transformer)))

(defn reset
  ""
  ([^ParallelTransformerIterator this]
    (-> this (.reset))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^ParallelTransformerIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<org.deeplearning4j.models.word2vec.VocabWord>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^ParallelTransformerIterator this]
    (-> this (.next))))

