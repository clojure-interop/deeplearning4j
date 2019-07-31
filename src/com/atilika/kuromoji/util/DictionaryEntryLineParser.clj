(ns com.atilika.kuromoji.util.DictionaryEntryLineParser
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.util DictionaryEntryLineParser]))

(defn ->dictionary-entry-line-parser
  "Constructor."
  (^DictionaryEntryLineParser []
    (new DictionaryEntryLineParser )))

(defn *parse-line
  "Parse CSV line

  line - line to parse - `java.lang.String`

  returns: String array of parsed valued, null - `java.lang.String[]`

  throws: java.lang.RuntimeException - on malformed input"
  ([^java.lang.String line]
    (DictionaryEntryLineParser/parseLine line)))

(defn *unescape
  "Unescape input for CSV

  text - text to be unescaped - `java.lang.String`

  returns: unescaped value, not null - `java.lang.String`"
  (^java.lang.String [^java.lang.String text]
    (DictionaryEntryLineParser/unescape text)))

(defn *escape
  "Escape input for CSV

  text - text to be escaped - `java.lang.String`

  returns: escaped value, not null - `java.lang.String`"
  (^java.lang.String [^java.lang.String text]
    (DictionaryEntryLineParser/escape text)))

