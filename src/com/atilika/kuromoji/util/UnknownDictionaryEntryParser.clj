(ns com.atilika.kuromoji.util.UnknownDictionaryEntryParser
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.util UnknownDictionaryEntryParser]))

(defn ->unknown-dictionary-entry-parser
  "Constructor."
  (^UnknownDictionaryEntryParser []
    (new UnknownDictionaryEntryParser )))

(defn parse
  "entry - `java.lang.String`

  returns: `com.atilika.kuromoji.dict.GenericDictionaryEntry`"
  (^com.atilika.kuromoji.dict.GenericDictionaryEntry [^UnknownDictionaryEntryParser this ^java.lang.String entry]
    (-> this (.parse entry))))

