package coop.rchain.domain

object OpCode extends Enumeration {
  type OpCode = Value
  val grpcEval, grpcDeploy, grpcPropose, grpcShow, rholang, nameToPar,
  rsongHexConversion, rsongRetrival, rsongRevnetwork, contractFile,
  playCountConversion, findName, cachingSong, unknown = Value
}

import OpCode._

case class Err(code: OpCode, msg: String)
