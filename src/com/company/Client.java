package com.company;

import com.company.tipoMotores.adaptador.MotorElectricoAdapter;
import com.company.tipoMotores.MotorComun;
import com.company.tipoMotores.MotorEconomico;
import com.company.objetivo.Motor;

public class Client {
    public static void test() {
        Motor motorComun = new MotorComun();
        motorComun.encender();
        motorComun.acelerar();
        motorComun.apagar();

        System.out.println("\n********************************\n");

        Motor motorEconomico = new MotorEconomico();
        motorEconomico.encender();
        motorEconomico.acelerar();
        motorEconomico.apagar();

        System.out.println("\n********************************\n");

        Motor motorElectricoAdapter = new MotorElectricoAdapter();
        motorElectricoAdapter.encender();
        motorElectricoAdapter.acelerar();
        motorElectricoAdapter.apagar();
    }
}
