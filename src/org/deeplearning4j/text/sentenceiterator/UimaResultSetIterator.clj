(ns org.deeplearning4j.text.sentenceiterator.UimaResultSetIterator
  "Iterates over and returns sentences
 based on the passed in analysis engine
 Database version of UimaSentenceIterator based off Adam Gibson's UimaSentenceIterator but extends BasicResultSetIterator
 Please note: for reset functionality, the underlying JDBC ResultSet must not be of TYPE_FORWARD_ONLY
 To achieve this using postgres you can make your query using:
 connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator UimaResultSetIterator]))

(defn ->uima-result-set-iterator
  "Constructor.

  Constructor which takes an existing UimaResource object

  rs - the database result set object to iterate over - `java.sql.ResultSet`
  column-name - the name of the column containing text - `java.lang.String`
  resource - `org.deeplearning4j.text.uima.UimaResource`"
  (^UimaResultSetIterator [^java.sql.ResultSet rs ^java.lang.String column-name ^org.deeplearning4j.text.uima.UimaResource resource]
    (new UimaResultSetIterator rs column-name resource))
  (^UimaResultSetIterator [^java.sql.ResultSet rs ^java.lang.String column-name]
    (new UimaResultSetIterator rs column-name)))

(defn next-sentence
  "Description copied from interface: SentenceIterator

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^UimaResultSetIterator this]
    (-> this (.nextSentence))))

(defn has-next?
  "Description copied from interface: SentenceIterator

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^UimaResultSetIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: SentenceIterator"
  ([^UimaResultSetIterator this]
    (-> this (.reset))))

(defn finish
  "Description copied from interface: SentenceIterator"
  ([^UimaResultSetIterator this]
    (-> this (.finish))))

