(ns com.atilika.kuromoji.compile.ConnectionCostsCompiler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.compile ConnectionCostsCompiler]))

(defn ->connection-costs-compiler
  "Constructor.

  output - `java.io.OutputStream`"
  (^ConnectionCostsCompiler [^java.io.OutputStream output]
    (new ConnectionCostsCompiler output)))

(defn read-costs
  "input - `java.io.InputStream`

  throws: java.io.IOException"
  ([^ConnectionCostsCompiler this ^java.io.InputStream input]
    (-> this (.readCosts input))))

(defn put-cost
  "forward-id - `short`
  backward-id - `short`
  cost - `short`"
  ([^ConnectionCostsCompiler this ^Short forward-id ^Short backward-id ^Short cost]
    (-> this (.putCost forward-id backward-id cost))))

(defn compile
  "throws: java.io.IOException"
  ([^ConnectionCostsCompiler this]
    (-> this (.compile))))

(defn get-cardinality
  "returns: `int`"
  (^Integer [^ConnectionCostsCompiler this]
    (-> this (.getCardinality))))

(defn get-costs
  "returns: `java.nio.ShortBuffer`"
  (^java.nio.ShortBuffer [^ConnectionCostsCompiler this]
    (-> this (.getCosts))))

