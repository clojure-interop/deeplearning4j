(ns com.atilika.kuromoji.dict.DictionaryEntryBase
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict DictionaryEntryBase]))

(defn ->dictionary-entry-base
  "Constructor.

  surface - `java.lang.String`
  left-id - `short`
  right-id - `short`
  word-cost - `short`"
  (^DictionaryEntryBase [^java.lang.String surface ^Short left-id ^Short right-id ^Short word-cost]
    (new DictionaryEntryBase surface left-id right-id word-cost)))

(defn get-surface
  "returns: `java.lang.String`"
  (^java.lang.String [^DictionaryEntryBase this]
    (-> this (.getSurface))))

(defn get-left-id
  "returns: `short`"
  (^Short [^DictionaryEntryBase this]
    (-> this (.getLeftId))))

(defn get-right-id
  "returns: `short`"
  (^Short [^DictionaryEntryBase this]
    (-> this (.getRightId))))

(defn get-word-cost
  "returns: `short`"
  (^Short [^DictionaryEntryBase this]
    (-> this (.getWordCost))))

