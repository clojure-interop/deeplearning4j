(ns com.atilika.kuromoji.dict.ConnectionCosts
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict ConnectionCosts]))

(defn ->connection-costs
  "Constructor.

  size - `int`
  costs - `java.nio.ShortBuffer`"
  (^ConnectionCosts [^Integer size ^java.nio.ShortBuffer costs]
    (new ConnectionCosts size costs)))

(def *-connection-costs-filename
  "Static Constant.

  type: java.lang.String"
  ConnectionCosts/CONNECTION_COSTS_FILENAME)

(defn *new-instance
  "resolver - `com.atilika.kuromoji.util.ResourceResolver`

  returns: `com.atilika.kuromoji.dict.ConnectionCosts`

  throws: java.io.IOException"
  (^com.atilika.kuromoji.dict.ConnectionCosts [^com.atilika.kuromoji.util.ResourceResolver resolver]
    (ConnectionCosts/newInstance resolver)))

(defn get
  "forward-id - `int`
  backward-id - `int`

  returns: `int`"
  (^Integer [^ConnectionCosts this ^Integer forward-id ^Integer backward-id]
    (-> this (.get forward-id backward-id))))

