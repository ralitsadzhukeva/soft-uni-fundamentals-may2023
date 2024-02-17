package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,Integer> heroesHP=new LinkedHashMap<>();
        LinkedHashMap<String,Integer> heroesMP = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String heroes = scanner.nextLine();
            String heroName = heroes.split("\\s+")[0];
            int hp = Integer.parseInt(heroes.split("\\s+")[1]);
            int manaPoints = Integer.parseInt(heroes.split("\\s+")[2]);

            if (hp<=100){
                heroesHP.put(heroName,hp);
            }
            if (manaPoints<=200){
                heroesMP.put(heroName,manaPoints);
            }
        }
        String[] commandParts = scanner.nextLine().split(" - ");
        String command = commandParts[0];
        while (!command.equals("End")){
            String heroName = commandParts[1];
            switch (command){
                case "CastSpell":
                    int neededMP =Integer.parseInt(commandParts[2]);
                    String spellName = commandParts[3];
                    int currentMP = heroesMP.get(heroName);

                    if (currentMP>=neededMP){
                        int mpLeft = currentMP-neededMP;
                        heroesMP.put(heroName,mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",heroName,spellName,mpLeft);
                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker =commandParts[3];
                    int currentHP = heroesHP.get(heroName);
                    int hpLeft = currentHP-damage;

                    if (hpLeft>0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,damage,attacker,hpLeft);
                    } else {
                        System.out.printf("%s has been killed by %s!%n",heroName,attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;
                case "Recharge":
                    int mpAmount = Integer.parseInt(commandParts[2]);
                    int current =heroesMP.get(heroName);
                    if (current+mpAmount>200){
                        current=200;
                    }
                    System.out.printf("%s recharged for %d MP!%n",heroName,mpAmount);
                    heroesMP.put(heroName,current);

                    break;
                case "Heal":
                    int hpAmount = Integer.parseInt(commandParts[2]);
                    int hpNow = heroesHP.get(heroName);
                    if (hpNow+hpAmount>100){
                        hpNow=100;
                    }
                    heroesHP.put(heroName,hpNow);
                    System.out.printf("%s healed for %d HP!%n",heroName,hpNow-heroesHP.get(heroName));
                    break;
            }
            command=scanner.nextLine();
        }
        heroesHP.entrySet()
                .forEach(entry ->{
                            String name = entry.getKey();
                            System.out.println(name);
                            System.out.printf("HP: %d%n",entry.getValue());
                            System.out.printf("MP: %d%n",heroesMP.get(name));
                        }
                );
    }
}
