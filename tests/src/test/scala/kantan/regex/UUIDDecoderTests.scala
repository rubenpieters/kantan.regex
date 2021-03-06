/*
 * Copyright 2016 Nicolas Rinaudo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kantan.regex

import java.util.UUID
import kantan.regex.laws.discipline.{GroupDecoderTests, MatchDecoderTests}
import kantan.regex.laws.discipline.arbitrary._
import org.scalatest.FunSuite
import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.typelevel.discipline.scalatest.Discipline

class UUIDDecoderTests extends FunSuite with GeneratorDrivenPropertyChecks with Discipline {
  //implicit val arbUUID = Arbitrary(Gen.uuid)

  checkAll("GroupDecoder[UUID]", GroupDecoderTests[UUID].decoder[Int, Int])
  checkAll("MatchDecoder[UUID]", MatchDecoderTests[UUID].decoder[Int, Int])
}
