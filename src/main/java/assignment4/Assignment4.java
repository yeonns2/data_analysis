package assignment4;

import java.util.*;
import java.util.stream.*;

public class Assignment4 {
	 public static void main(String[] args) {
	 String str = "Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub,[19][20] particularly for client-server web applications, with a reported 9 million developers. "
	 + "Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle) and released in 1995 as a core component of Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GNU General Public License. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the OpenJDK JVM which is free open source software and used by most developers including the Eclipse IDE and is the default JVM for almost all Linux distributions. "
	 + "The latest version is Java 15, released in September 2020, with Java 11, a currently supported long-term support (LTS) version, released on September 25, 2018; Oracle released for the legacy Java 8 LTS the last zero-cost public update in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal use up to at least December 2020. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades. "
	 + "Oracle (and others) highly recommend uninstalling older versions of Java because of serious risks due to unresolved security issues.[22] Since Java 9, 10, 12 and 13 are no longer supported, Oracle advises its users to immediately transition to the latest version (currently Java 15) or an LTS release. ";
	 // 위의 str를 \\s (white space) 로 split한 array를 Parallel Stream으로 유지해 두었다.
	 Stream<String> stream = Arrays.stream(str.split("\\s")).parallel();
	 
	 stream
	 .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
	 .forEach((e1, e2) -> System.out.printf("%s = %d, ", e1, e2));

	
	 // stream을 처리하여 워드 카운트를 수행하시오. 결과의 예시는 다음과 같다.
	 // 아래의 결과를 보면 java는 21번 등장한 것이다. 
	 // {been=1, compilers,=1, (such=1, languages.=1, (which=1, 11,=1, anywhere=1,
	 // without=1, offer=1, meaning=1, builds=1, advises=1, let=1, because=1,
	 // January=1, released=5, general-purpose=1, 11=1, 12=1, 13=1, release.=1,
	 // personal=1, version=2, an=1, Sun=4, as=4, at=2, Machine,=1, 8=3, 9=1,
	 // bytecode=1, C=1, least=1, 25,=1, OpenJDK=2, recommend=1, immediately=1,
	 // object-oriented=1, Process,=1, GNU=1, The=4, default=1, As=2, are=4,
	 // supported,=1, by=4, reported=1, free=1, popular=1, latest=2, a=5, Java=21,
	 // languages=1, 2020.=1, 2020,=1, one=1, transition=1, the=13,
	 // GitHub,[19][20]=1, component=1, HotSpot=1, to=10, under=2, (WORA),=1, open=1,
	 // supported=1, Other=1, JVM=2, but=1, commercial=1, 15)=1, 15,=1, available=1,
	 // official=1, others)=1, had=1, run=3, language=2, source=1, IDE=1,
	 // developed=1, specifications=1, either=1, serious=1, dynamic=1, up=1, has=2,
	 // vendors=1, acquired=1, programming=3, which=1, offers=1, relicensed=1,
	 // last=1, reflection=1, need=1, typically=2, its=3, originally=2, users=1,
	 // technologies=1, longer=1, Linux=1, General=1, low-level=1, architecture.=1,
	 // (and=1, support=3, however=1, virtual=2, September=2, Microsystems'=1, for=6,
	 // update=1, updates=1, 2007,=1, 2019,=1, not=1, compiled=3, proprietary=1,
	 // provides=1, Oracle=4, class=1, zero-cost=2, applications,=1, capabilities=1,
	 // was=2, libraries=1, class-based,=1, possible.=1, 2019=1, with=4, although=1,
	 // syntax=1, Community=1, applications=1, them.=1, software=1, modification)=1,
	 // developers=2, Eclipse=1, December=1, 9,=1, write=1, 2018;=1, similar=1,
	 // still=2, in=6, Gosling=1, is=8, it=1, underlying=1, dependencies=1,
	 // Microsystems=1, unresolved=1, traditional=1, million=1, versions=1,
	 // (currently=1, other=1, May=1, It=1, upgrades.=1, receiving=1, machines,=1,
	 // Oracle)=1, computer=1, 1995=1, web=1, have=2, older=1, recompilation.=1,
	 // particularly=1, James=1, distributions.=1, machine=1, facilities=1, once,=1,
	 // almost=1, use=2, own=1, fewer=1, begun=1, used=1, platforms=1, reference=2,
	 // that=6, than=1, few=1, regardless=1, otherwise=1, all=2, issues.[22]=1,
	 // including=1, (JVM)=1, runtime=2, Public=1, most=3, (LTS)=1, core=1, use,=1,
	 // were=1, C++,=1, since=1, no=1, legacy=1, code=2, according=1, LTS=2,
	 // client-server=1, can=2, security=2, public=2, and=10, intended=1, License.=1,
	 // of=12, Since=1, designed=1, highly=1, on=3, uninstalling=1, or=1, original=1,
	 // will=1, implementation=3, Virtual=1, 10,=1, any=1, risks=1, developers.=1,
	 // currently=1, platform.=1, application=1, due=1, compliance=1, version,=1,
	 // licenses.=1, long-term=1}
	 }
	}