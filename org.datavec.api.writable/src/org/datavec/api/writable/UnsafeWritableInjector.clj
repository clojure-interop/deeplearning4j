(ns org.datavec.api.writable.UnsafeWritableInjector
  "Created by huitseeker on 5/13/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable UnsafeWritableInjector]))

(defn ->unsafe-writable-injector
  "Constructor."
  (^UnsafeWritableInjector []
    (new UnsafeWritableInjector )))

(defn *inject
  "x - `T`

  returns: `<T> org.datavec.api.writable.Writable`"
  ([x]
    (UnsafeWritableInjector/inject x)))

