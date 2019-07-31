(ns org.deeplearning4j.text.sentenceiterator.BasicResultSetIterator
  "Primitive iterator over a SQL ResultSet
 Please note: for reset functionality, the underlying JDBC ResultSet must not be of TYPE_FORWARD_ONLY
 To achieve this using postgres you can make your query using: connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
 This class is designed in a similar fashion to org.deeplearning4j.text.sentenceiterator.BasicLineIterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator BasicResultSetIterator]))

(defn ->basic-result-set-iterator
  "Constructor.

  rs - `java.sql.ResultSet`
  column-name - `java.lang.String`"
  (^BasicResultSetIterator [^java.sql.ResultSet rs ^java.lang.String column-name]
    (new BasicResultSetIterator rs column-name)))

(defn next-sentence
  "Description copied from interface: SentenceIterator

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^BasicResultSetIterator this]
    (-> this (.nextSentence))))

(defn has-next?
  "Description copied from interface: SentenceIterator

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^BasicResultSetIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: SentenceIterator"
  ([^BasicResultSetIterator this]
    (-> this (.reset))))

(defn finish
  "Description copied from interface: SentenceIterator"
  ([^BasicResultSetIterator this]
    (-> this (.finish))))

(defn get-pre-processor
  "returns: `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  (^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor [^BasicResultSetIterator this]
    (-> this (.getPreProcessor))))

(defn set-pre-processor
  "pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  ([^BasicResultSetIterator this ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

