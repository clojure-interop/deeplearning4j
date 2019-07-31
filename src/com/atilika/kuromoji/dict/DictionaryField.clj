(ns com.atilika.kuromoji.dict.DictionaryField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict DictionaryField]))

(defn ->dictionary-field
  "Constructor."
  (^DictionaryField []
    (new DictionaryField )))

(def *-surface
  "Static Constant.

  type: int"
  DictionaryField/SURFACE)

(def *-left-id
  "Static Constant.

  type: int"
  DictionaryField/LEFT_ID)

(def *-right-id
  "Static Constant.

  type: int"
  DictionaryField/RIGHT_ID)

(def *-word-cost
  "Static Constant.

  type: int"
  DictionaryField/WORD_COST)

