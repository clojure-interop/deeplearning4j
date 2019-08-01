(ns org.nd4j.graph.OpType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph OpType]))

(def *-transform
  "Static Constant.

  type: byte"
  OpType/TRANSFORM)

(def *-accumulation
  "Static Constant.

  type: byte"
  OpType/ACCUMULATION)

(def *-index-accumulation
  "Static Constant.

  type: byte"
  OpType/INDEX_ACCUMULATION)

(def *-scalar
  "Static Constant.

  type: byte"
  OpType/SCALAR)

(def *-broadcast
  "Static Constant.

  type: byte"
  OpType/BROADCAST)

(def *-pairwise
  "Static Constant.

  type: byte"
  OpType/PAIRWISE)

(def *-accumulation-3
  "Static Constant.

  type: byte"
  OpType/ACCUMULATION3)

(def *-summarystats
  "Static Constant.

  type: byte"
  OpType/SUMMARYSTATS)

(def *-shape
  "Static Constant.

  type: byte"
  OpType/SHAPE)

(def *-aggregation
  "Static Constant.

  type: byte"
  OpType/AGGREGATION)

(def *-random
  "Static Constant.

  type: byte"
  OpType/RANDOM)

(def *-custom
  "Static Constant.

  type: byte"
  OpType/CUSTOM)

(def *-graph
  "Static Constant.

  type: byte"
  OpType/GRAPH)

(def *-variable
  "Static Constant.

  type: byte"
  OpType/VARIABLE)

(def *-boolean
  "Static Constant.

  type: byte"
  OpType/BOOLEAN)

(def *-logic
  "Static Constant.

  type: byte"
  OpType/LOGIC)

