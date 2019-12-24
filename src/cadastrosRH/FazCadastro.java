package cadastrosRH;

import java.util.Scanner;

public class FazCadastro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int opcad, opcademp, codset;
		double valcred, valdiv, salbase, imp, ajdcust, valprod, comi, valvends;
		String continua, nome, endereço, telefone;
		
		do {
				
			System.out.println("===| OPÇÕES DE CADASTRO |===\n"
								+ "1 - CADASTRAR FORNECEDOR\n"
								+ "2 - CADASTRAR EMPREGADOS\n"
								+ "Digite sua opção de cadastro:");
				
				opcad = input.nextInt();
				switch (opcad) {
				
				case 1 :
					
					System.out.println("===| CADASTRO FORNECEDOR |===");
					
					Fornecedor forn = new Fornecedor();
					Pessoa fornpes = new Pessoa();
					
					//Utilizei o metodo nextLine a mais, para ler o ENTER(\n), e não consumir meu próximo String.
					//Teria uma outra solução para isso?
					nome = input.nextLine();
					
					System.out.println("Nome:");
					nome = input.nextLine();
					fornpes.setNome(nome);
					
					System.out.println("Endereço:");
					endereço = input.nextLine();
					fornpes.setEndereço(endereço);
					
					System.out.println("Telefone(00)00000-0000:");
					telefone = input.nextLine();
					fornpes.setTelefone(telefone);
					
					System.out.println("Digite o valor do CRÉDITO com o fornecedor(R$):");
					valcred = input.nextDouble();
					forn.setValorCredito(valcred);
					
					System.out.println("Digite o valor da DÍVIDA com o fornecedor(R$):");
					valdiv = input.nextDouble();
					forn.setValorDivida(valdiv);
					
					System.out.println("Nome: " + fornpes.getNome());
					System.out.println("Endereço: " + fornpes.getEndereço());
					System.out.println("Telefone: " + fornpes.getTelefone());
					System.out.println("O Saldo com o Fornecedor é de(R$): " + forn.getObterSaldo());
					
					break;
					
				case 2 :
					
					System.out.println("===| CADASTRO EMPREGADOS |===\n"
										+ "1 - CADASTRAR ADMINISTRADOR\n"
										+ "2 - CADASTRAR OPERÁRIO\n"
										+ "3 - CADASTRAR VENDEDOR\n"
										+ "Digite sua opção de cadastro:");
					
					opcademp = input.nextInt();
					
					switch (opcademp) {
					
					case 1:
						
						System.out.println("===| CADASTRO ADMINISTRADOR |===");
						
						Pessoa admpes = new Pessoa();
						Administrador adm = new Administrador();
						
						nome = input.nextLine();
						
						System.out.println("Nome:");
						nome = input.nextLine();
						admpes.setNome(nome);
						
						System.out.println("Endereço:");
						endereço = input.nextLine();
						admpes.setEndereço(endereço);
						
						System.out.println("Telefone(00)00000-0000:");
						telefone = input.nextLine();
						admpes.setTelefone(telefone);
						
						System.out.println("Código do Setor(000):");
						codset = input.nextInt();
						adm.setCodigoSetor(codset);
						
						System.out.println("Sálario Base(R$):");
						salbase = input.nextInt();
						adm.setSalarioBase(salbase);
						
						System.out.println("Imposto(%):");
						imp = input.nextInt();
						adm.setImposto(imp);
						
						System.out.println("Ajuda de Custo(R$):");
						ajdcust = input.nextInt();
						adm.setAjudaDeCusto(ajdcust);
						
						System.out.println("Nome: " + admpes.getNome());
						System.out.println("Endereço: " + admpes.getEndereço());
						System.out.println("Telefone: " + admpes.getTelefone());
						System.out.println("Código do Setor: " + adm.getCodigoSetor());
						System.out.println("Salário Líquido(R$): " + adm.getCalcularSalario());
						
						break;
						
					case 2:
						
						System.out.println("===| CADASTRO OPERÁRIO |===");
						
						Pessoa operpes = new Pessoa();
						Operario oper = new Operario();
						
						nome = input.nextLine();
						
						System.out.println("Nome:");
						nome = input.nextLine();
						operpes.setNome(nome);
						
						System.out.println("Endereço:");
						endereço = input.nextLine();
						operpes.setEndereço(endereço);
						
						System.out.println("Telefone(00)00000-0000:");
						telefone = input.nextLine();
						operpes.setTelefone(telefone);
						
						System.out.println("Código do Setor(000):");
						codset = input.nextInt();
						oper.setCodigoSetor(codset);
						
						System.out.println("Sálario Base(R$):");
						salbase = input.nextInt();
						oper.setSalarioBase(salbase);
						
						System.out.println("Imposto(%):");
						imp = input.nextInt();
						oper.setImposto(imp);
						
						System.out.println("Valor Produção(R$):");
						valprod = input.nextInt();
						oper.setValorProducao(valprod);
						
						System.out.println("Valor Comissão(%):");
						comi = input.nextInt();
						oper.setComissao(comi);
						
						
						System.out.println("Nome: " + operpes.getNome());
						System.out.println("Endereço: " + operpes.getEndereço());
						System.out.println("Telefone: " + operpes.getTelefone());
						System.out.println("Código do Setor: " + oper.getCodigoSetor());
						System.out.println("Salário Líquido(R$): " + oper.getCalcularSalario());
						
						break;
						
					case 3:
						
						System.out.println("===| CADASTRO VENDEDOR |===");
						
						Pessoa vendpes = new Pessoa();
						Vendedor vend = new Vendedor();
						
						nome = input.nextLine();
						
						System.out.println("Nome:");
						nome = input.nextLine();
						vendpes.setNome(nome);
						
						System.out.println("Endereço:");
						endereço = input.nextLine();
						vendpes.setEndereço(endereço);
						
						System.out.println("Telefone(00)00000-0000:");
						telefone = input.nextLine();
						vendpes.setTelefone(telefone);
						
						System.out.println("Código do Setor(000):");
						codset = input.nextInt();
						vend.setCodigoSetor(codset);
						
						System.out.println("Sálario Base(R$):");
						salbase = input.nextInt();
						vend.setSalarioBase(salbase);
						
						System.out.println("Imposto(%):");
						imp = input.nextInt();
						vend.setImposto(imp);
						
						System.out.println("Valor Vendas(R$):");
						valvends = input.nextInt();
						vend.setValorVendas(valvends);
						
						System.out.println("Valor Comissão(%):");
						comi = input.nextInt();
						vend.setComissao(comi);
						
						
						System.out.println("Nome: " + vendpes.getNome());
						System.out.println("Endereço: " + vendpes.getEndereço());
						System.out.println("Telefone: " + vendpes.getTelefone());
						System.out.println("Código do Setor: " + vend.getCodigoSetor());
						System.out.println("Salário Líquido(R$): " + vend.getCalcularSalario());
						
						break;
				
					default:System.out.println("Opção Inválida");
				}
				
				break;
					
			default:System.out.println("Opção Inválida");
			
			}
			
			System.out.println("\nDeseja fazer outro cadastro (s/n)?");
			continua = input.next();	
				
		} while(!continua.equals("n"));
		
		System.out.println("| | | CADASTRO ENCERRADO | | |");
		
		input.close();
	}

}
